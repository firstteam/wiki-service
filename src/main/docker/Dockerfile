FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.6.0
COPY app.jar /wiki-service.jar
ENTRYPOINT exec java $JAVA_OPTS  -jar /wiki-service.jar

