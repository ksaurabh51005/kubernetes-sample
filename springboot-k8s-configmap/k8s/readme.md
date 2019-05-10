#ConfigMaps as Environment variables
  kubectl create configmap spring-boot-configmaps-demo --from-literal=greeter.prefix="Hello" -n ks-sample

#Create ConfigMap from file
  kubectl create configmap spring-app-config --from-file=src/main/resources/application.properties -n ks-sample
  
  before runnig update application.properties file with new content
  from
  greeter.message=%s %s! Spring Boot application.properties has been mounted as volume on Kubernetes!
  to
  greeter.message=%s %s! Spring Boot application.properties has been loaded from configmap file on Kubernetes!
  
  kubectl get configmap spring-app-config -o yaml