(ns ringr.core
  (:gen-class)
  (:use ring.adapter.jetty)
)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "I am alive!"})


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (run-jetty handler {:port 3000}))


