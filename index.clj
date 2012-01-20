{:namespaces
 ({:source-url nil,
   :wiki-url "clj-kafka.core-api.html",
   :name "clj-kafka.core",
   :doc nil}),
 :vars
 ({:arglists
   ([host
     port
     &
     {:keys [timeout buffer-size],
      :or {timeout 100000, buffer-size 10000}}]),
   :name "create-consumer",
   :namespace "clj-kafka.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-kafka.core-api.html#clj-kafka.core/create-consumer",
   :doc
   "Create a consumer to connect to host and port. Port will\nnormally be 9092.",
   :var-type "function",
   :line 18,
   :file "src/clj_kafka/core.clj"}
  {:arglists ([topic partition offset max-size]),
   :name "fetch",
   :namespace "clj-kafka.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-kafka.core-api.html#clj-kafka.core/fetch",
   :doc
   "Creates a request to retrieve a set of messages from the\nspecified topic.\n\nArguments:\npartition: as specified when producing messages\noffset: offset to start retrieval\nmax-size: number of bytes to retrieve",
   :var-type "function",
   :line 24,
   :file "src/clj_kafka/core.clj"}
  {:arglists ([consumer request]),
   :name "messages",
   :namespace "clj-kafka.core",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url "/clj-kafka.core-api.html#clj-kafka.core/messages",
   :doc "Creates a sequence of messages from the given request.",
   :var-type "function",
   :line 35,
   :file "src/clj_kafka/core.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url "/clj-kafka.core-api.html#clj-kafka.core/to-clojure",
   :namespace "clj-kafka.core",
   :var-type "function",
   :arglists ([_]),
   :doc "Converts type to Clojure structure",
   :name "to-clojure"})}
