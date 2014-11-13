(ns clojure.unicode
  (:require
    clojure.set))

(def ≠ not=)
(def ¬ not)
(defmacro ∧ [& rest] `(and ~@rest))
(defmacro ∨ [& rest] `(or ~@rest))

(def × *)
(def ÷ /)
(def − -)
(def ≤ <=)
(def ≥ >=)
(def ≡ ==)
(defn ≢ [& args] (¬ (apply == args)))
(def ∞ Double/POSITIVE_INFINITY)
(defn ∑ [coll] (reduce + coll))
(defn ∏ [coll] (reduce * coll))

(def ∈ contains?)
(defn ∉ [coll key] (¬ (∈ coll key)))
(def ∀ every?)
(def ∃ some)
(def ∄ not-any?)
(def ∪ clojure.set/union)
(def ∩ clojure.set/intersection)
(def ∖ clojure.set/difference)
(def ∅ #{})

(defmacro ↠ [& rest] `(->> ~@rest))
(defmacro → [& rest] `(-> ~@rest))
(defmacro λ [& rest] `(fn ~@rest))
(def ∘ comp)
