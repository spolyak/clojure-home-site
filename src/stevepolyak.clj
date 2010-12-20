(ns stevepolyak
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [stevepolyak.response :only [success]]
        [stevepolyak.templates :only [index]]
        [compojure :only [defroutes GET]]
        [ring.util.servlet :only [defservice]]))

(defroutes app
  (GET "/*" req (success index)))

(defservice app)