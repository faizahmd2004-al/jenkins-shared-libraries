def call(String imageName, String dockerUser) {

    echo "Tagging Docker image..."

    sh "docker tag ${imageName}:latest ${dockerUser}/${imageName}:latest"

    echo "Pushing Docker image..."

    sh "docker push ${dockerUser}/${imageName}:latest"

    echo "Docker push successful"
}
