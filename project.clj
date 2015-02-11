(defproject mex "0.1.0-SNAPSHOT"
  :description "Macro Expansion for ClojureScript"
  :url "https://github.com/imikushin/mex"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2850"]]
  :profiles {:dev {:node-dependencies [[source-map-support "^0.2.9"]]
                   :plugins           [[lein-cljsbuild "1.0.4"]]}}
  :source-paths ["src"]
  :test-paths ["test"]
  :cljsbuild {:builds [{:source-paths   ["src" "test"]
                        :notify-command ["node" "./scripts/run-tests.js"]
                        :compiler       {:target         :nodejs
                                         :output-to      "target/out/test.js"
                                         :output-dir     "target/out"
                                         :optimizations  :none
                                         :cache-analysis true
                                         :source-map     true
                                         :pretty-print   true}}]})
