pipeline{
    agent any

    stages{
        stage('Build and Push to Artifactory'){
            steps{
                tool name: 'Maven3.8.6', type: 'maven'
                sh 'mvn clean install'
            }
        }
        stage('Build and Publish image in Docker'){
            tool name: 'Docker', type: 'docker'
            sh 'docker build --no-cache -t ${JOB_NAME}:${BUILD_NUMBER} .'
            sh 'docker image ls | grep ${JOB_NAME}:${BUILD_NUMBER}'
        }
    }
}