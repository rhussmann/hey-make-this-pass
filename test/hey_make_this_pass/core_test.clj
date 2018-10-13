(ns hey-make-this-pass.core-test
  (:require [clojure.test :refer :all]
            [hey-make-this-pass.core :refer :all]))

(deftest a-test
  (testing "I pass!"
    (is (= 1 1))))

(deftest even-test
  (testing "Help, I fail!"
    (is (even 100))))

(deftest odd-test
  (testing "Help, I fail!"
    (is (odd 99))))
