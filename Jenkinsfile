pipeline {
  agent {
    kubernetes {
        label 'jenkins-slave'
        yaml '''
apiVersion: v1
kind: Pod
metadata:
  name: maven-pod
spec:
  containers:
    - name: mavenimage
      image: maven:3.6.3-jdk-8
      command: ["sleep", "infinity"]
     
'''
   }
  }
   
   stages {

    stage('Cloning Repository') {
      steps {
        container('maven') {
            git branch: 'main', credentialsId: 'b3ed1e05-7887-4d9b-bfbf-780d442a4426', url: 'git@github.com:SakshiVelukar/java-app.git'       }
     }
    }

    stage('Installing dependency') {
      steps {
        container('maven') {
           sh 'mvn clean install'
         }
      }
   }
}
}
