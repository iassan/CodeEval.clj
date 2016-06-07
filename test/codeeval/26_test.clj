(ns codeeval.26-test
  (:require [clojure.test :refer :all]
            [codeeval.26 :refer :all]))

(deftest challenge0026
  (is (= 1843676 (file-length "/home/dino/stuff/telefon.mp3"))))
