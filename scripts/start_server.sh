#启动应用
cd /home/ec2-user/target
echo "nohup java  -Xms256m -Xmx256m -jar app.jar --server.port=8080 >/home/ec2-user/consolelog/$jarname.log &"
nohup  java  -Xms256m -Xmx256m -jar app.jar --server.port=8080>/home/ec2-user/consolelog/$jarname.log & 2>1 &
echo "/home/ec2-user/consolelog/$jarname.log"
