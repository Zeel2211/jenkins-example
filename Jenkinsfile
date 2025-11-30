def gv
pipeline {
    agent any
    stages {
        stage ("Init"){
            when{
                expression{
                    return env.BRANCH_NAME == 'main'
                }
            }
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("Building Docker Image") {
            when{
                expression{
                    return env.BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    gv.buildImage()
                }
            }
        }

        stage("Completed") {
            when{
                expression{
                    return env.BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    gv.completeTask()
                }
            }
        }
    }
}
