[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.example.app%3Aexample-app&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.example.app%3Aexample-app)

# TravisSonarTest
Test Travis CI with SonarCloud

## How to create such a test

Create new repository "my-app" on Github.

Clone repository 

```bash
git clone path-to-my-app
```

Create maven project:

```bash
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
cd my-app
git add src pom.xml
git commit -m "Add maven"
```

Create file .travis.yml with this content:

```yaml
language: java
```

Add travis support:

```bash
git add .travis.yaml
git commit -m "Add travis"
```

Add sonar support by following this guide: https://docs.travis-ci.com/user/sonarcloud/ .


