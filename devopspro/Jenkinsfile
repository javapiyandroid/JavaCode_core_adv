node
{
stage('SCM checkout')
{
git 'https://github.com/javapiyandroid/JavaCode_core_adv/devopspro'
}

stage('Compile-Package'){
def mvnHome= tool name: 'maven3.6', type: 'maven'

        sh "${mvnHome}/bin/mvn package"

} 
}

