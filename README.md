## clojure-unicode

Clojure library that binds rich Unicode symbols to traditional clojure.core macros and operations.

### Usage

```
:dependencies [
  [clojure.unicode "0.2.1"]
]
```

```clj
(use clojure.unicode)

(≠ 1 2)         ;; ⇒ true
(¬ false)       ;; ⇒ true
(∧ true false)  ;; ⇒ false
(∨ true false)  ;; ⇒ true

(× 1 2 3)       ;; ⇒ 6
(÷ 1 2)         ;; ⇒ 1/2
(− 1)           ;; ⇒ -1
(≤ 1 2 2 3)     ;; ⇒ true
(≥ 4 2 2 0)     ;; ⇒ true
(≡ 1 1 1)       ;; ⇒ true
(≢ 1 1 2)       ;; ⇒ true
(< 1 ∞)         ;; ⇒ true
(∑ (range 0 5)) ;; ⇒ 10
(∏ (range 1 5)) ;; ⇒ 24

(∋ #{1 2 3} 1)    ;; ⇒ true
(∌ #{1 2 3} 5)    ;; ⇒ true
(∈ 1 #{1 2 3})    ;; ⇒ true
(∉ 5 #{1 2 3})    ;; ⇒ true
(∀ odd? #{1 5 3}) ;; ⇒ true
(∃ even? [1 2 3]) ;; ⇒ true
(∄ even? [1 5 3]) ;; ⇒ true
(∪ #{1 2} #{2 3}) ;; ⇒ #{ 1 3 2 }
(∩ #{1 2} #{2 3}) ;; ⇒ #{ 2 }
(⊆ #{2} #{1 2 3}) ;; ⇒ true
(⊇ #{1 2} #{1})   ;; ⇒ true
(⊈ #{1 2} #{1 3}) ;; ⇒ true
(⊉ #{1 2} #{1 3}) ;; ⇒ true
(∈ ∅ 1)           ;; ⇒ false
(∖ #{1 2 3} #{3}) ;; ⇒ #{ 1 2 }

(↠ [1 2 3] (map inc)) ;; ⇒ (2 3 4)
(→ 1 inc)             ;; ⇒ 2
((λ [x] (inc x)) 1)   ;; ⇒ 2
((∘ str inc) 1)       ;; ⇒ "2"
```

### How do I type all these symbols?

This part is left as an exercise for the reader.

### Changelog

0.2.1: Subsets and supersets tests added: `⊆`, `⊇`, `⊈`, `⊉`  
0.2.0: Swapped arguments order for `∈` and `∉`, added `∋` and `∌`  
0.1.0: Initial release  

### License

Copyright © 2014 Nikita Prokopov

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
