def call(credentialsId){

     withCredentials([usernamePassword(
            credentialsId: "Jfrog-api",
            usernameVariable: "Username,
            passwordVariable: "Password"
    )]) 
            
}
    
//Username
//Password
