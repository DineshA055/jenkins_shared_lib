def call(credentialsId){

     withCredentials([usernamePassword(
            credentialsId: "Jfrog-api",
            usernameVariable: "admin",
            passwordVariable: "Alliswell@5"
    )]) 
     {
          sh 'curl -X PUT -u $USER -p $PASS -T /var/lib/jenkins/workspace/jfrog_test/target/*.jar http://3.109.184.227:8082/artifactory/example-repo-local/'
     }
//Username
//Password
