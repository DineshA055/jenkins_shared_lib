//def call(credentialsId){

  //   withCredentials([usernamePassword(
     //       credentialsId: "Jfrog-api",
        //    usernameVariable: "USER,
     //       passwordVariable: "PASS"
   // )]) 
            
//}


//def call(credentialsId){

//   withJfrogArtifactoryeEnv(credentialsId: credentialsId) {
         // 'sh curl -X -u admin -p -T /var/lib/jenkins/workspace/jfrog_test/target/*.jar http://3.109.184.227:8082/artifactory/example-repo-local/
//   }
//}
//Username
//Password

def call(){
    withCredentials([usernamePassword(
            credentialsId: "Artifact",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) 
    //sh "docker image push ${hubUser}/${project}:${ImageTag}"
   // sh "docker image push ${hubUser}/${project}:latest"   
  
  'sh curl -X -u ${USER} -p {PASS} -T /var/lib/jenkins/workspace/jfrog_test/target/*.jar http://3.109.184.227:8082/artifactory/example-repo-local/'
  }

