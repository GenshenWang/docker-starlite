# 依赖的基础镜像jdk8
FROM java:8

#VOLUME ，VOLUME 指向了一个/tmp的目录，由于Spring Boot使用内置的Tomcat容器，Tomcat 默认使用/tmp作为工作目录
VOLUME ./tmp

# 需要暴露出去项目的端口
EXPOSE 8888

# 作者信息
MAINTAINER wgs

#将主机环境的jar包，以文件名demo.jar添加到docker镜像中。就是因为这条命令，mavnen运行报错
ADD ./target/docker-springboot-demo-0.0.1-SNAPSHOT.jar docker-springboot-demo.jar

#启动容器之后，默认的运行命令
ENTRYPOINT ["java","-jar","docker-springboot-demo.jar"]