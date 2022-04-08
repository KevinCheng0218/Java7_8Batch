# memcached vs redis

||Memcached|Redis|
|---|---|---|
|Sub-millisecond latency|Yes|Yes|
|Developer ease of use|Yes|Yes|
|Data partitioning|Yes|Yes|
|Support for a broad set of programming languages|Yes|Yes|
|Advanced data structures|-|Yes|
|Multithreaded architecture|Yes|-|
|Snapshots|-|Yes|
|Replication|-|Yes|
|Transactions|-|Yes|
|Pub/Sub|-|Yes|
|Lua scripting|-|Yes|
|Geospatial support|-|Yes| 

### Sub-millisecond latency  
By storing data in-memory they can read data more quickly than disk based databases.

### Developer ease of use 
* Both Redis and Memcached are syntactically easy to use and require a minimal amount of code to integrate into your application.

### Data partitioning 
* Both Redis and Memcached allow you to distribute your data among multiple nodes. This allows you to scale out to better handle more data when demand grows.

### Support for a broad set of programming languages 
* Both Redis and Memcached have many open-source clients available for developers. Supported languages include Java, Python, PHP, C, C++, C#, JavaScript, Node.js, Ruby, Go and many others.

### Advanced data structures 
* In addition to strings, Redis supports lists, sets, sorted sets, hashes, bit arrays, and hyperloglogs. Applications can use these more advanced data structures to support a variety of use cases. For example, you can use Redis Sorted Sets to easily implement a game leaderboard that keeps a list of players sorted by their rank.

### Multithreaded architecture 
* Since Memcached is multithreaded, it can make use of multiple processing cores. This means that you can handle more operations by scaling up compute capacity.

### Snapshots 
* With Redis you can keep your data on disk with a point in time snapshot which can be used for archiving or recovery.

### Replication 
* Redis lets you create multiple replicas of a Redis primary. This allows you to scale database reads and to have highly available clusters.

### Transactions 
* Redis supports transactions which let you execute a group of commands as an isolated and atomic operation.

### Pub/Sub 
* Redis supports Pub/Sub messaging with pattern matching which you can use for high performance chat rooms, real-time comment streams, social media feeds, and server intercommunication.

### Lua scripting 
* Redis allows you to execute transactional Lua scripts. Scripts can help you boost performance and simplify your application.

### Geospatial support 
* Redis has purpose-built commands for working with real-time geospatial data at scale. You can perform operations like finding the distance between two elements (for example people or places) and finding all elements within a given distance of a point.

# AWS: Elastic Cache
Amazon ElastiCache makes it easy to set up, manage, and scale distributed in-memory cache environments in the AWS Cloud. It provides a high performance, resizable, and cost-effective in-memory cache while removing the complexity associated with deploying and managing a distributed cache environment. ElastiCache works with both the Redis and Memcached engines.

![image](https://user-images.githubusercontent.com/102642989/162381960-c7f52484-c6f7-4901-a683-e81f1018d676.png)

###### _Reference_
[Amazon memcached vs redis](https://aws.amazon.com/elasticache/redis-vs-memcached/)
[Amazon Elastic Cache](https://aws.amazon.com/elasticache/?trk=b06167e1-43fa-471a-8705-6a37423dd3e1&sc_channel=ps&sc_campaign=acquisition&sc_medium=ACQ-P|PS-GO|Non-Brand|Desktop|SU|Database|Solution|US|EN|DSA&ef_id=CjwKCAjwur-SBhB6EiwA5sKtjktOtUADhH_tSPhDL9lbBE6ScI4Mp3eyPvtOhlaBH-r33eIQFbrsihoCuJAQAvD_BwE:G:s&s_kwcid=AL!4422!3!587945177034!!!g!!)
