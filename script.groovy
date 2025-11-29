def buildImage(){
    echo "Building Docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker build -t patelzeel424/jenkins_test:latest .'
        sh 'docker push patelzeel424/jenkins_test:latest'
        }
}
def completeTask(){
    echo "Task is completed.."
}

return this