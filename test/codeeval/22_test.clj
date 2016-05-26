(ns codeeval.22-test
  (:require [clojure.test :refer :all]
            [codeeval.22 :refer :all]))

(deftest solve0022
  (is (= 5 (solve "5")))
  (is (= 144 (solve "12"))))
