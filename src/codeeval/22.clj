(ns codeeval.22)

; general functions and definitions
(defn fibonacci-fn [a b]
  (cons a (lazy-seq (fibonacci-fn b (+ a b)))))

(def fibonacci (fibonacci-fn 0 1))

; standalone solution
(defn read-indexes [filename]
  (map #(Long. %) (clojure.string/split-lines (slurp filename))))

(defn solution [filename]
  (map #(nth fibonacci %) (read-indexes filename)))

(defn -main [& args]
  (doseq [result (solution (first args))] (println result)))

; solution using codeeval template
(defn solve [input]
  (nth fibonacci (Long. input)))

(defn do-something-with [input]
  (println (solve input)))

;(with-open [rdr (clojure.java.io/reader (first *command-line-args*))]
;  (doseq [line (remove empty? (line-seq rdr))]
;    (do-something-with line)))
