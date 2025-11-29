pipeline {
    agent any

    stages {
        stage("Building Docker Image") {
            steps {
                script {
                    echo "Building Docker image..."

                    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker build -t patelzeel424/jenkins_test:latest .'
                        sh 'docker push patelzeel424/jenkins_test:latest'
                    }
                }
            }
        }

        stage("Completed") {
            steps {
                echo "Task is completed.."
            }
        }
    }
}
