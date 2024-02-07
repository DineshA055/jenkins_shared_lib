def call(credentialsId){

     withCredentials([usernamePassword(
            credentialsId: "Jfrog-api",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {{
      sh 'Curl -X PUT -u $USER -p $PASS -T *.jar http://3.109.184.227:8081/artifactory/example-repo-local/
    }
}
//Username
//Password
