pipeline {
   agent 
   label {'java'} 
   tools {
      maven 'Maven 3.8.7'
   } 
   stages {
    stage('checkout') {
        steps {
            git 'https://github.com/ajithbhuvi232-cell/CICDdemo.git'
        }
    }
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