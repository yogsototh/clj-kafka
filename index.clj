{:namespaces
 ({:source-url nil,
   :wiki-url "clj-kafka.consumer.simple-api.html",
   :name "clj-kafka.consumer.simple",
   :doc nil}
  {:source-url nil,
   :wiki-url "clj-kafka.consumer.zk-api.html",
   :name "clj-kafka.consumer.zk",
   :doc nil}
  {:source-url nil,
   :wiki-url "clj-kafka.core-api.html",
   :name "clj-kafka.core",
   :doc nil}
  {:source-url nil,
   :wiki-url "clj-kafka.producer-api.html",
   :name "clj-kafka.producer",
   :doc nil}),
 :vars
 ({:arglists
   ([host
     port
     &
     {:keys [timeout buffer-size],
      :or {timeout 100000, buffer-size 10000}}]),
   :name "consumer",
   :namespace "clj-kafka.consumer.simple",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.simple-api.html#clj-kafka.consumer.simple/consumer",
   :doc
   "Create a consumer to connect to host and port. Port will\nnormally be 9092.",
   :var-type "function",
   :line 6,
   :file "src/clj_kafka/consumer/simple.clj"}
  {:arglists ([consumer topic partition]),
   :name "earliest-offset",
   :namespace "clj-kafka.consumer.simple",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.simple-api.html#clj-kafka.consumer.simple/earliest-offset",
   :doc
   "Retrieves the earliest offset available for topic and partition.",
   :var-type "function",
   :line 12,
   :file "src/clj_kafka/consumer/simple.clj"}
  {:arglists ([topic partition offset max-size]),
   :name "fetch",
   :namespace "clj-kafka.consumer.simple",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.simple-api.html#clj-kafka.consumer.simple/fetch",
   :doc
   "Creates a request to retrieve a set of messages from the\nspecified topic.\n\nArguments:\npartition: as specified when producing messages\noffset: offset to start retrieval\nmax-size: number of bytes to retrieve",
   :var-type "function",
   :line 26,
   :file "src/clj_kafka/consumer/simple.clj"}
  {:arglists ([consumer topic partition n]),
   :name "latest-offsets",
   :namespace "clj-kafka.consumer.simple",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.simple-api.html#clj-kafka.consumer.simple/latest-offsets",
   :doc "Retrieves n most recent offsets for topic and partition.",
   :var-type "function",
   :line 17,
   :file "src/clj_kafka/consumer/simple.clj"}
  {:arglists ([consumer request]),
   :name "messages",
   :namespace "clj-kafka.consumer.simple",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.simple-api.html#clj-kafka.consumer.simple/messages",
   :doc "Creates a sequence of messages from the given request.",
   :var-type "function",
   :line 37,
   :file "src/clj_kafka/consumer/simple.clj"}
  {:arglists ([m]),
   :name "consumer",
   :namespace "clj-kafka.consumer.zk",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.zk-api.html#clj-kafka.consumer.zk/consumer",
   :doc
   "Uses information in Zookeeper to connect to Kafka. More info on settings\n is available here: http://incubator.apache.org/kafka/configuration.html\n\n Recommended for using with with-resource:\n (with-resource [c (consumer m)]\n   shutdown\n   (take 5 (messages c \"test\")))\n\n Keys:\n zk.connect             : host:port for Zookeeper. e.g: 127.0.0.1:2181\n groupid                : consumer group. e.g. group1\n zk.sessiontimeout.ms   : session timeout. e.g. 400\n zk.synctime.ms         : Max time for how far a ZK follower can be behind a ZK leader. 200 ms\n autocommit.interval.ms : the frequency that the consumed offsets are committed to zookeeper.\n autocommit.enable      : if set to true, the consumer periodically commits to zookeeper the latest consumed offset of each partition",
   :var-type "function",
   :line 5,
   :file "src/clj_kafka/consumer/zk.clj"}
  {:arglists ([consumer topic]),
   :name "messages",
   :namespace "clj-kafka.consumer.zk",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.zk-api.html#clj-kafka.consumer.zk/messages",
   :doc "Creates a sequence of messages",
   :var-type "function",
   :line 30,
   :file "src/clj_kafka/consumer/zk.clj"}
  {:arglists ([consumer]),
   :name "shutdown",
   :namespace "clj-kafka.consumer.zk",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.consumer.zk-api.html#clj-kafka.consumer.zk/shutdown",
   :doc
   "Closes the connection to Zookeeper and stops consuming messages.",
   :var-type "function",
   :line 25,
   :file "src/clj_kafka/consumer/zk.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url "/clj-kafka.core-api.html#clj-kafka.core/to-clojure",
   :namespace "clj-kafka.core",
   :var-type "function",
   :arglists ([x]),
   :doc "Converts type to Clojure structure",
   :name "to-clojure"}
  {:arglists ([payload]),
   :name "message",
   :namespace "clj-kafka.producer",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-kafka.producer-api.html#clj-kafka.producer/message",
   :doc
   "Creates a message with the specified payload.\npayload : bytes for the message payload. e.g. (.getBytes \"hello, world\")",
   :var-type "function",
   :line 14,
   :file "src/clj_kafka/producer.clj"}
  {:arglists ([m]),
   :name "producer",
   :namespace "clj-kafka.producer",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.producer-api.html#clj-kafka.producer/producer",
   :doc
   "Creates a Producer. m is the configuration\nserializer.class : default is kafka.serializer.DefaultEncoder\nzk.connect       : Zookeeper connection. e.g. localhost:2181 ",
   :var-type "function",
   :line 7,
   :file "src/clj_kafka/producer.clj"}
  {:arglists ([producer topic msgs]),
   :name "send-messages",
   :namespace "clj-kafka.producer",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-kafka.producer-api.html#clj-kafka.producer/send-messages",
   :doc
   "Sends a message.\ntopic   : a string\nmsgs    : a single message, or sequence of messages to send",
   :var-type "function",
   :line 20,
   :file "src/clj_kafka/producer.clj"})}
