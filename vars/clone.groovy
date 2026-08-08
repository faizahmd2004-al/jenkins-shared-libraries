def call(String repoUrl, String branch = "main") {

    echo "Cloning code..."

    git url: repoUrl, branch: branch

    echo "Clone successful"
}
  
