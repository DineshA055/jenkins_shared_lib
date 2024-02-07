def call(credentialsId){

     withCredentials([usernamePassword(
            credentialsId: "Jfrog-api",
            usernameVariable: "USER,
            passwordVariable: "PASS"
    )]) 
            
}
    
//Username
//Password
