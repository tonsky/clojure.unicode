(ns clojure.test-unicode
  (:use
    clojure.test
    clojure.unicode))

(deftest bools
  (are [x y] (= x y)
    (≠ 1 2)        true
    (¬ false)      true
    (∧ true false) false
    (∨ true false) true))

(deftest numbers
  (are [x y] (= x y)
    (× 1 2 3) 6
    (÷ 1 2)   1/2
    (− 1)     -1
    (≤ 1 2 2 3) true
    (≥ 4 2 2 0) true
    (≡ 1 1 1)   true
    (≢ 1 1 2)   true
    (< 1 ∞)     true
    (∑ (range 0 5)) 10
    (∏ (range 1 5)) 24))

(deftest sets
  (are [x y] (= x y)
    (∈ #{1 2 3} 1)    true
    (∉ #{1 2 3} 5)    true
    (∀ odd? #{1 5 3}) true
    (∃ even? [1 2 3]) true
    (∄ even? [1 5 3]) true
    (∪ #{1 2} #{2 3}) #{1 2 3}
    (∩ #{1 2} #{2 3}) #{2}
    (∈ ∅ 1)           false
    (∖ #{1 3} #{3 4}) #{1}))

(deftest functions
  (are [x y] (= x y)
    (↠ [1 2 3] (map inc)) [2 3 4]
    (→ 1 inc)              2
    ((λ [t] (inc t)) 1)    2
    ((∘ str inc) 1)       "2"))

#_(test-ns 'clojure.test-unicode)
