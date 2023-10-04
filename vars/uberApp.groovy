def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Tools initialization") {
               steps {
                   sh 'ls -la /usr/local/bin'
                   sh 'java -version'
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-maven") {
               steps {
                   sh 'lsblk'
               }
           }
           stage("build-stage") {
                steps {
                     echo 'build-stage in diff app'
                }
           }
       }
    }
}