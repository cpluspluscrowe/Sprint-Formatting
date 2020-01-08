(ns date-format.core-test
  (:require [clojure.test :refer :all]
            [date-format.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))


(deftest create-sprints-test
  (testing "FIXME, I fail."
    (is (= (create-sprints (list "1" "2") 1 "")
           "Sprint 1: 1 - 2\n"
           ))))

(deftest test-constructor
  (testing "FIXME, I fail."
    (is (= (create-sprints (list "1" "2"))
           "Sprint 1: 1 - 2\n"
           ))))
