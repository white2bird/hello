# 使用 Java 8 作为基础镜像
FROM openjdk:8-jdk-alpine

# 设置维护者信息

# 设置工作目录
WORKDIR /app

# 将本地的 JAR 文件复制到镜像中
COPY cola_hello_start/target/*.jar app.jar

# 暴露端口（假设 Spring Boot 应用监听 8080 端口）
EXPOSE 8082

# 设置启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]