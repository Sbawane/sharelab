def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'a43f6a8f-0b10-48e7-885e-c4c44ed63eeb', path: '', url: "${ip}", contextPath: "${appname}"], war: '**/*.war'
 }

