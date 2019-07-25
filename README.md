# learning-spring-boot
Repo for learning spring boot

`mvn clean install` to build project  
`mvn clean install -PskipNpm` to build jar without node generated resources  
`mvn clean install -PnpmStart` to run `npm start` that's in the resource directory (for dev templating of UI, Runs browserSync)  
`mvn clean install -localQuickDeploy` to run spring-boot app without generating/re-generating npm resources  
`mvn spring-boot:run` run spring-boot app and generate/re-generate npm resources
