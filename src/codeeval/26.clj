(ns codeeval.26)

(defn file-length [path] (.length (clojure.java.io/file path)))

(defn do-something-with [input]
  (println (file-length input)))
