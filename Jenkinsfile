pipeline {
   agent {label 'java'}
   stages {
    stage('build') {
        steps {
            sh 'mvn clean package'
        }
    }
    stage('output') {
        steps {
            sh 'echo "Build successful!"'
        }
    }
}
}