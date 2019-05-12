## ConfigMaps as Environment variables
  kubectl create configmap spring-boot-configmaps-demo --from-literal=greeter.prefix="Hello" -n ks-sample

## Create ConfigMap from file
  kubectl create configmap spring-app-config --from-file=src/main/resources/application.properties -n ks-sample
  
  before runnig update application.properties file with new content
  from
  greeter.message=%s %s! Spring Boot application.properties has been mounted as volume on Kubernetes!
  to
  greeter.message=%s %s! Spring Boot application.properties has been loaded from configmap file on Kubernetes!
  
  kubectl get configmap spring-app-config -o yaml
  
  
## Commands
k create -f configmap-fromfile-deployment.yaml
k delete -f configmap-fromfile-deployment.yaml

To check if the volume has been mounted execute the command,
kubectl exec spring-boot-configmaps-demo-3812387281-f566v -- cat /deployments/config/application.properties

http://192.168.2.14:31362/greet/kumar


## Point to note 1
1. to mount application.properties file in configmap care needs to be taken
	1.1 If in docker file application is deploying in directory /app then application.properities file 
		should mount as /app/config. Since spring boot application load external configuration file from 
		file:./config/
		file:./
		classpath:/config/
		classpath:/
