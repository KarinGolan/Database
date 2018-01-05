# Cookbook Name:: Database-
# Recipe:: default
#
# Copyright (C) 2017 
#
execute "download file from  s3" do
command "aws s3 cp s3://#{node['database']['BucketName']}/Database-0.0.1-SNAPSHOT.jar   /home/ec2-user/Database-0.0.1-SNAPSHOT.jar"
 action "run"
end


execute "running Database.jar" do
  command "java -jar /home/ec2-user/Database-0.0.1-SNAPSHOT.jar 5050 >>result.txt "
  cwd "/home/ec2-user"
  action "run"
end