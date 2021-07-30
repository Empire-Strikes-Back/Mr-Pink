(defproject movie-query "0.0.0"

  :repositories [["conjars" {:url "https://conjars.org/repo"}]
                 ["clojars" {:url "https://clojars.org/repo"}]
                 ["oracle" {:url "https://download.oracle.com/maven"}]]
  
  :min-lein-version "2.0.0"

  :plugins []
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "0.4.490"]
                 [nrepl "0.6.0"]
                 [cider/cider-nrepl "0.21.1"]
                ;  [mvxcvi/puget "1.1.2"]
                 [mvxcvi/whidbey "2.1.1"]
                 [org.clojure/data.csv "0.1.4"]
                 [org.clojure/data.csv "0.1.4"]

                 [org.clojure/java.jdbc "0.7.9"]
                 [org.postgresql/postgresql "42.2.6"]
                 [clj-time "0.15.0"]
                ;  [org.postgresql/postgresql "42.2.5.jre7"]
                 ]

  :repl-options {:init-ns          main
                 :main             main
                 :host             "0.0.0.0"
                 :port             4001}
  :profiles {}


  :main ^{:skip-aot true} main
  :jvm-opts ["-Xms768m" "-Xmx2048m" "-Xmx1g"]
  :source-paths ["src"]
  :java-source-paths ["src"]
  :resource-paths ["resources"]

  :auto-clean false)
