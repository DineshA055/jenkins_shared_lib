def call(credentialsId){

    withJfrogArtifactoryEnv(credentialsId: credentialsId) {
      sh 'Curl -X PUT -u $username -p $password -T *.jar http://3.109.184.227:8081/artifactory/example-repo-local/
    }
}
