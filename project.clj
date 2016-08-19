(defproject s3-emrfs-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
      [org.clojure/clojure "1.8.0"]
      [cascalog/cascalog-core "3.0.0"]
      [cascalog/cascalog-more-taps "3.0.0"]
    ]
  :profiles { 
      :dev {
        :dependencies [
          [org.apache.hadoop/hadoop-core "1.2.1"]
          [cascalog/midje-cascalog "3.0.0"]
        ]
      }
      :plugins [
        [lein-midje "3.0.1"]
      ]
      :provided {
        :dependencies [
          [org.apache.hadoop/hadoop-client "2.7.2"]
          [org.apache.hadoop/hadoop-common "2.7.2"]
        ]
      }
      :uberjar {:aot :all}
  }
  :main ^:skip-aot s3-emrfs-test.core
  :target-path "target/%s")
