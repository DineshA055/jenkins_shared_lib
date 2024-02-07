def call(credentialsId){

    withJfrogArtifactoryEnv(credentialsId: Jfrog-api) {
      sh 'Curl -X PUT -u $Username -p $Password -T *.jar http://3.109.184.227:8081/artifactory/example-repo-local/
    }
}
//Username
//Password
