def gv
pipeline {
    agent any
    stages {
        stage ("Init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("Building Docker Image") {
            steps {
                script {
                    gv.buildImage()
                }
            }
        }

        stage("Completed") {
            steps {
                script {
                    gv.completeTask()
                }
            }
        }
    }
}
