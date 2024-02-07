def call(credentialsId){

     withCredentials([usernamePassword(
            credentialsId: "Jfrog-api",
            usernameVariable: "Username,
            passwordVariable: "Password"
    )]) {
             sh 'curl -X PUT -u $username -p $password -T /var/lib/jenkins/workspace/jfrog_test/target/*.jar http://3.109.184.227:8082/artifactory/example-repo-local/'
     }
}
    
//Username
//Password
