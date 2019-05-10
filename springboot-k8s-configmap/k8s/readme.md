#ConfigMaps as Environment variables
  kubectl create configmap spring-boot-configmaps-demo --from-literal=greeter.prefix="Hello"

#Create ConfigMap from file
  kubectl create configmap spring-app-config --from-file=src/main/resources/application.properties