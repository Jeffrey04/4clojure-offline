; Write a function which generates the <a href="http://en.wikipedia.org/wiki/Transitive_closure">transitive closure of a <a href="http://en.wikipedia.org/wiki/Binary_relation">binary relation.  The relation will be represented as a set of 2 item vectors.
; http://www.4clojure.com/problem/84

; (let [divides #{[8 4] [9 3] [4 2] [27 9]}]   (= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]}))
; (let [more-legs       #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}]   (= (__ more-legs)      #{["cat" "man"] ["cat" "snake"] ["man" "snake"]        ["spider" "cat"] ["spider" "man"] ["spider" "snake"]}))
; (let [progeny       #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}]   (= (__ progeny)      #{["father" "son"] ["father" "grandson"]        ["uncle" "cousin"] ["son" "grandson"]}))

