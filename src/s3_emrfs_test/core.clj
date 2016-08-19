(ns s3-emrfs-test.core
  (:gen-class))

(use 'cascalog.api)
(use 'cascalog.more-taps)

(def src 
  [
    ["Hello"]
    ["World"]
    ["I"]
    ["can"]
    ["has"]
    ["write"]
  ]
)

(defn -main
  "I test to see if S3 paths s3:// work in EMR cascalog"
  [in out & args]
  (println "Hello, World!")
  (?-
    (hfs-textline out :sinkmode :replace)
    (<- [?line] (src ?line))

    (stdout)
    (<- [?line] ((hfs-textline in) ?line))
  )
)