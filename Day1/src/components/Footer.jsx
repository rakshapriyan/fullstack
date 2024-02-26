import React from 'react';
import '../assets/css/Footer.css';

const Footer = () => {
  return (
    <div className='foot'>

      <footer className="footer">
        <div className="footer-content">
          <div className="footer-section about">
            <h2>About Us</h2>
            <p>
              Lorem ipsum dolor, sit amet consectetur adipisicing elit. Sit velit temporibus cum, dicta, illo quas iusto dolorem praesentium nisi est consectetur commodi unde possimus laborum repudiandae, magni consequuntur esse non!
            </p>
            <div className="contact">
              <span><i className="fas fa-phone"></i>123-456-789</span>
              <span><i className="fas fa-envelope"></i>educonnect@admin.ac.com</span>
            </div>
            <div className="socials">
              <a href="#"><i className="fab fa-facebook"></i></a>
              <a href="#"><i className="fab fa-twitter"></i></a>
              <a href="#"><i className="fab fa-instagram"></i></a>
              <a href="#"><i className="fab fa-linkedin"></i></a>
            </div>
          </div>
          <div className="footer-section links">
            <h2>Quick Links</h2>
            <ul>
              <li><a href="#">Home</a></li>
              <li><a href="#">Services</a></li>
              <li><a href="#">About Us</a></li>
              <li><a href="#">Contact</a></li>
            </ul>
          </div>
          <div className="footer-section contact-form">
            <h2>Contact Us</h2>
            <form>
              <input type="email" name="email" className="text-input contact-input" placeholder="Your email address" />
              <textarea name="message" className="text-input contact-input" placeholder="Your message"></textarea>
              <button type="submit" className="btn btn-big contact-btn">
                <i className="fas fa-envelope"></i>
                Send
              </button>
            </form>
          </div>
        </div>
        <div className="footer-bottom">
          &copy; educonnect.com | Designed by Gray Matter
        </div>
      </footer>
    </div>
  );
};

export default Footer;
