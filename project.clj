(defproject pq "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clojurewerkz/money "1.9.0"]
                 [swiss-arrows "1.0.0"]
                 [clj-time "0.11.0"]]
  :main ^:skip-aot pq.oe
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
