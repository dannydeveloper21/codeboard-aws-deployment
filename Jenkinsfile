pipeline{
    agent any
    stages {
        stage('Build and Push to Artifactory') {
            steps {
                sh "mvn clean install"
            }
        }
        stage('Build and Publish image in Docker'){
            steps{
                sh '''
                    docker build --no-cache -t ${JOB_NAME}:${BUILD_NUMBER} .
                    docker image ls | grep ${JOB_NAME}:${BUILD_NUMBER}
                '''
            }
        }
    }
}