#Secrets as Environment Variables
  kubectl create secret generic spring-security \
--from-literal=spring.user.name=demo \
--from-literal=spring.user.password=password

#Create secrets from file
  kubectl create secret generic spring-github-demo \
  --from-file ./github.user \
  --from-file ./github.token
  
#If you wish to see how your Secrets look, execute the following command,  
  kubectl get secret spring-security -o yaml
  
#The sample output of the above command is shown below.
apiVersion: v1
data:
  spring.user.name: ZGVtbw==
  spring.user.password: cGFzc3dvcmQ=
kind: Secret
metadata:
  creationTimestamp: 2017-09-19T15:24:29Z
  name: spring-security
  namespace: default
  resourceVersion: "71363"
  selfLink: /api/v1/namespaces/default/secrets/spring-security
  uid: a0e0254e-9d4e-11e7-9b8d-080027da6995
type: Opaque