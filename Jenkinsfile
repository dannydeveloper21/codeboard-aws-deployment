pipeline{
    agent any
    stages {
        stage('Build and Push to Artifactory') {
            steps {
                sh '''
                    export MAVEN_HOME=/opt/homebrew/Cellar/maven/3.8.6/libexec
                    export PATH=$PATH:$MAVEN_HOME/bin
                    mvn --version
                    mvn clean install
                '''
            }
        }
        stage('Build and Publish image in Docker'){
            steps{
                sh '''
                    docker build --no-cache -t ${JOB_NAME}:${BUILD_NUMBER} .
                    docker images | grep ${JOB_NAME}
                    docker run -d -p 9000:8082 --name ${JOB_NAME} ${JOB_NAME}:${BUILD_NUMBER}
                '''
                echo "Build Process completed"
            }
        }
    }
}
