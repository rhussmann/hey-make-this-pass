(ns hey-make-this-pass.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn even
  "Is this number even?"
  [n]
  (= (mod n 2) 0))

(defn odd
  "Is this number odd?"
  [n]
  (not (even n)))
